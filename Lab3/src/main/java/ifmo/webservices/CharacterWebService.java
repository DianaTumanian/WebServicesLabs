package ifmo.webservices;

import ifmo.webservices.client.ObjectFactory;
import ifmo.webservices.errors.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

@WebService(name = "CharacterWebService", targetNamespace = "http://webservices.ifmo/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface CharacterWebService {


    /**
     * @return returns java.util.List<ifmo.webservices.Character>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCharacters", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.GetAllCharacters")
    @ResponseWrapper(localName = "getAllCharactersResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.GetAllCharactersResponse")
    public List<Character> getAllCharacters() throws DatabaseException;

    /**
     * @param conditions
     * @return returns java.util.List<ifmo.webservices.Character>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCharacters", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.GetCharacters")
    @ResponseWrapper(localName = "getCharactersResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.GetCharactersResponse")
    public List<Character> getCharacters(
            @WebParam(name = "conditions", targetNamespace = "")
                    List<CharacterFieldValue> conditions) throws DatabaseException;

    ;

    /**
     * @param id
     * @param newValues
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifyCharacter", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.ModifyCharacter")
    @ResponseWrapper(localName = "modifyCharacterResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.ModifyCharacterResponse")
    public boolean modifyCharacter(
            @WebParam(name = "id", targetNamespace = "")
                    int id,
            @WebParam(name = "newValues", targetNamespace = "")
                    List<CharacterFieldValue> newValues) throws InvalidNameException, InvalidRaceException, InvalidHpException, InvalidExlevelException, CharacterNotFoundException, DatabaseException;

    ;

    /**
     * @param character
     * @return returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCharacter", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.AddCharacter")
    @ResponseWrapper(localName = "addCharacterResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.AddCharacterResponse")
    public int addCharacter(
            @WebParam(name = "character", targetNamespace = "")
                    Character character) throws InvalidNameException, InvalidHeroClassException, InvalidRaceException, InvalidHpException, InvalidExlevelException, DatabaseException;

    /**
     * @param id
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCharacter", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.DeleteCharacter")
    @ResponseWrapper(localName = "deleteCharacterResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.DeleteCharacterResponse")
    public boolean deleteCharacter(
            @WebParam(name = "id", targetNamespace = "")
                    int id) throws CharacterNotFoundException, DatabaseException;

}
