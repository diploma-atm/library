/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package kz.diploma.adapter.access.api;

import kz.diploma.adapter.access.model.AdminResponse;
import kz.diploma.adapter.access.model.ClientClientResponse;
import kz.diploma.adapter.access.model.ClientResponse;
import kz.diploma.adapter.access.model.ProductProductResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Validated
@Api(value = "AdapterController", description = "the AdapterController API")
public interface AdapterControllerApi {

    @ApiOperation(value = "", nickname = "getAdminById", notes = "", response = AdminResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AdminResponse.class) })
    @RequestMapping(value = "/adapter/admin/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<AdminResponse> getAdminById(@ApiParam(value = "",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "", nickname = "getAdminByPhoneNumber", notes = "", response = AdminResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AdminResponse.class) })
    @RequestMapping(value = "/adapter/admin/phone-number",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<AdminResponse> getAdminByPhoneNumber(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "phoneNumber", required = true) String phoneNumber);


    @ApiOperation(value = "", nickname = "getAllAdmins", notes = "", response = AdminResponse.class, responseContainer = "List", tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AdminResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/adapter/admin",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AdminResponse>> getAllAdmins();


    @ApiOperation(value = "", nickname = "getAllClients", notes = "", response = ClientResponse.class, responseContainer = "List", tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/adapter/clients",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ClientResponse>> getAllClients();


    @ApiOperation(value = "", nickname = "getAllClientsResponse", notes = "", response = ClientClientResponse.class, responseContainer = "List", tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientClientResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/adapter/all/clients",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ClientClientResponse>> getAllClientsResponse();


    @ApiOperation(value = "", nickname = "getClient", notes = "", response = ClientClientResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientClientResponse.class) })
    @RequestMapping(value = "/adapter/client/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ClientClientResponse> getClient(@ApiParam(value = "",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "", nickname = "getClient1", notes = "", response = ClientClientResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientClientResponse.class) })
    @RequestMapping(value = "/adapter/client/pan",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ClientClientResponse> getClient1(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "pan", required = true) String pan);


    @ApiOperation(value = "", nickname = "getClientByFio", notes = "", response = ClientClientResponse.class, responseContainer = "List", tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientClientResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/adapter/client/fio",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ClientClientResponse>> getClientByFio(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "surname", required = true) String surname,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "name", required = true) String name,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "lastname", required = true) String lastname);


    @ApiOperation(value = "", nickname = "getClientByPhoneNumber", notes = "", response = ClientClientResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ClientClientResponse.class) })
    @RequestMapping(value = "/adapter/client/phone-number",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ClientClientResponse> getClientByPhoneNumber(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "phoneNumber", required = true) String phoneNumber);


    @ApiOperation(value = "", nickname = "getProductById", notes = "", response = ProductProductResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProductProductResponse.class) })
    @RequestMapping(value = "/adapter/product/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ProductProductResponse> getProductById(@ApiParam(value = "",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "", nickname = "getProductByPan", notes = "", response = ProductProductResponse.class, tags={ "adapter-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProductProductResponse.class) })
    @RequestMapping(value = "/adapter/product/pan/{pan}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ProductProductResponse> getProductByPan(@ApiParam(value = "",required=true) @PathVariable("pan") String pan);

}
