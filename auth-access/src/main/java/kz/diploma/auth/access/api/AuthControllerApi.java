/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package kz.diploma.auth.access.api;

import io.swagger.annotations.*;
import kz.diploma.auth.access.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Validated
@Api(value = "AuthController", description = "the AuthController API")
public interface AuthControllerApi {

    @ApiOperation(value = "", nickname = "authenticate", notes = "", response = AuthResponseDTO.class, tags={ "auth-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuthResponseDTO.class) })
    @RequestMapping(value = "/authenticate",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<AuthResponseDTO> authenticate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuthRequest authRequest);


    @ApiOperation(value = "", nickname = "checkPin", notes = "", response = AuthResponseDTO.class, tags={ "auth-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuthResponseDTO.class) })
    @RequestMapping(value = "/check-pin",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<AuthResponseDTO> checkPin(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PinRequest pinRequest);


    @ApiOperation(value = "", nickname = "checkSession", notes = "", response = UserInfoDTO.class, tags={ "auth-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserInfoDTO.class) })
    @RequestMapping(value = "/check/session",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UserInfoDTO> checkSession(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CheckSessionRequest checkSessionRequest);


    @ApiOperation(value = "", nickname = "logout", notes = "", tags={ "auth-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/logout",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> logout(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CheckSessionRequest checkSessionRequest);

}
