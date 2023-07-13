package com.barclays.app.domain;

import java.time.LocalDate;

public record Transaction(LocalDate tranDate,
								String tranDetails,
								float debitAmt,
								float creditAmt,
								float accountBalance) {

}
