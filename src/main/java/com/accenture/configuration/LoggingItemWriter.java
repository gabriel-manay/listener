package com.accenture.configuration;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.entity.TCR00;
import com.accenture.entity.TCR00DTO;

public class LoggingItemWriter implements ItemWriter<TCR00> {

    @Autowired
    TCR00DTO TCR00DTO;

    /**
     * Cada línea de tipo Transaction se agrega a lista de transacciones en DTO
     * para que ListenerApplication las envíe al canal de salida
     */
    @Override
    public void write(List<? extends TCR00> list) throws Exception {
        TCR00DTO.addTransaction(list.get(0));
    }
}
