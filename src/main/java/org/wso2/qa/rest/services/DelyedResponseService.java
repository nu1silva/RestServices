/*
 * Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.qa.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/delay")
public class DelyedResponseService {

    @GET
    @Path("/{delay}")
    public Response getDelayedResponse(@PathParam("delay") int delay) throws InterruptedException {
        Thread.sleep(delay);
        System.out.println("Delaying response by [" + delay / 1000.0     + "] seconds");
        String output = "Response delay [" + delay / 1000.0 + "] seconds";
        return Response.status(200).entity(output).build();
    }
}