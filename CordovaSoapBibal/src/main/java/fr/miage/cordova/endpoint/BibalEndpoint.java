/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.cordova.endpoint;

import io.spring.guides.gs_producing_web_service.*;
import fr.miage.cordova.repository.BibalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author alex
 */
@CrossOrigin(origins = "*") 
@Endpoint
public class BibalEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private BibalRepository bibalRepository;

    @Autowired
    public BibalEndpoint(BibalRepository bibalRepository) {
        this.bibalRepository = bibalRepository;
    }

    @CrossOrigin
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(bibalRepository.findBook(request.getName()));

        return response;
    }
}


