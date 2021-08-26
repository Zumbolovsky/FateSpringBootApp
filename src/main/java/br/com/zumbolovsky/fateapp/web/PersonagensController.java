package br.com.zumbolovsky.fateapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.zumbolovsky.fateapp.domain.Personagens;
import br.com.zumbolovsky.fateapp.service.PersonagensService;

@RestController
public class PersonagensController {

  @Autowired
  private PersonagensService personagensService;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping(
      value = "/personagens",
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public void save(@RequestBody final PersonagensVO personagens) {
    final Personagens request = new Personagens();
    request.setNome(personagens.getNome());
    personagensService.insert(request);
  }
}