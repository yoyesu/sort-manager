package com.sparta.ms.sort_manager.logging;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return LocalDate.now().format(DateTimeFormatter.ISO_DATE)
                + "---" + record.getSourceMethodName()
                + "---" + record.getLevel()
                + "---" + formatMessage(record)
                + "\n";
    }

    @Override
    public String formatMessage(LogRecord record) {
        String message = record.getMessage();
        if (record.getLevel() == Level.FINE){
            message = "---+" + record.getMessage();
        } else if (record.getLevel() == Level.FINER){
            message = "---++" + record.getMessage();
        } else if (record.getLevel() == Level.FINEST){
            message = "---+++" + record.getMessage();
        }

        return message;
    }
}
