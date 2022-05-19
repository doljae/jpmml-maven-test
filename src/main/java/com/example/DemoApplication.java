package com.example;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import jakarta.xml.bind.JAXBException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        File file = null;
        try {
            new LoadingModelEvaluatorBuilder().load(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException | JAXBException e) {
            e.printStackTrace();
        }
    }

}
