/*
 *
 *  Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package com.zlw.springboot.demo.controller;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zlw.springboot.demo.Responses;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping(value = "/infos", produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE, "application/x-smile"})
@Api(value = "/infos", tags = "infos", description = "消息通知")
public class InfoController {

  @RequestMapping(value = "", method = GET)
  @ApiOperation(
          value = "return infos", notes = "Returns infos ",
          response = String.class,
          authorizations = {
                  @Authorization(value = "api_key"),
                  @Authorization(value = "auth", scopes = {
                          @AuthorizationScope(scope = "write_infos", description = ""),
                          @AuthorizationScope(scope = "read_infos", description = "")
                  })})
  @ApiResponses(value = {
          @ApiResponse(code = 400, message = "Invalid ID supplied"),
          @ApiResponse(code = 404, message = "Info not found")}
  )
  public ResponseEntity<String> getInfo(){
    return Responses.ok("OK");
  }

  
}
