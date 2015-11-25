package com.thoughtworks.wjlin;

import com.thoughtworks.wjlin.bean.Car;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class Jersey {

    @GET
    @Path("/plain/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Jersey say: " + msg;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCar() {
        Car car = new Car();
        car.setColor("red");
        car.setCount(10);

        return car;
    }
}
