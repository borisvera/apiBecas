package beca.transactions.application;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beca.accounts.domain.entity.BankAccount;
import beca.accounts.domain.repository.BankAccountRepository;
import beca.common.application.Notification;
import beca.common.application.enumeration.RequestBodyType;
import beca.transactions.application.dto.RequestBankTransferDto;
import beca.transactions.domain.service.TransferDomainService;

@Service()
public class TransactionApplicationService {
	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Autowired
	private TransferDomainService transferDomainService;

	@Transactional
	public void performTransfer(RequestBankTransferDto requestBankTransferDto) throws Exception {
		Notification notification = this.validation(requestBankTransferDto);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
		BankAccount originAccount = this.bankAccountRepository.findByNumberLocked(requestBankTransferDto.getFromAccountNumber());
		BankAccount destinationAccount = this.bankAccountRepository.findByNumberLocked(requestBankTransferDto.getToAccountNumber());
		this.transferDomainService.performTransfer(originAccount, destinationAccount, requestBankTransferDto.getAmount());
		this.bankAccountRepository.save(originAccount);
		this.bankAccountRepository.save(destinationAccount);
	}
	
	private Notification validation(RequestBankTransferDto requestBankTransferDto) {
		Notification notification = new Notification();
		if (requestBankTransferDto == null || requestBankTransferDto.getRequestBodyType() == RequestBodyType.INVALID) {
			notification.addError("Invalid JSON data in request body.");
		}
		return notification;
	}
}
