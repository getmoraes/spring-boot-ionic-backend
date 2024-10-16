package com.treino.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.treino.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
