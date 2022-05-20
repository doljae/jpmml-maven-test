package com.example.configuration;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.xml.sax.SAXException;

import jakarta.xml.bind.JAXBException;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class JPMMLConfiguration {
    private final ResourceLoader resourceLoader;

    @Bean
    public Evaluator defaultEvaluator()
        throws JAXBException, ParserConfigurationException, IOException, SAXException {
        return loadEvaluator("XXX.pmml");
    }

    private Evaluator loadEvaluator(String pmmlFileName)
        throws JAXBException, ParserConfigurationException, SAXException, IOException {

        final InputStream model =
            resourceLoader.getResource("classpath:/" + pmmlFileName).getInputStream();

        return new LoadingModelEvaluatorBuilder().load(model).build();
    }
}
