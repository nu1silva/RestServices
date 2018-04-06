/*
 * Copyright (c) 2018, nu1silva.com. (https://nu1silva.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nu1silva.services.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/status")
public class HTTPStatusService {

    @GET
    @Path("/{status_code}")
    public Response returnStatus(@PathParam("status_code") String statusCode) {
        System.out.println("Returining Status Code [" + statusCode + "]");
        String output = "HTTP Status Code : " + statusCode;
        return Response.status(Integer.parseInt(statusCode)).entity(output).build();
    }
}
