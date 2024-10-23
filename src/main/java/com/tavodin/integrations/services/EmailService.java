package com.tavodin.integrations.services;

import com.tavodin.integrations.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);
}
