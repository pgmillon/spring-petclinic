package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

/**
 * @author Pierre-Gildas MILLON <pierre-gildas.millon@ext.adeoservices.com>
 */
@Controller
public class WelcomeController {

  @Value("${env.name}")
  String envName;

  @RequestMapping("/")
  public String showWelcome(Map<String, Object> model) {
    model.put("envName", envName);
    return "welcome";
  }

}
