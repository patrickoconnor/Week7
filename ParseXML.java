import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class ParseXML 
	{
	
	public ParseXML(String arg[])
		{


		try
			{
				//File to import and read. Needs to be read from directory above bin.
				File inputFile = new File("input.dat");
				
				//Store and build so the information can be parsed and displayed.
				DocumentBuilderFactory startNewDoc = DocumentBuilderFactory.newInstance();
				DocumentBuilder buildDoc = startNewDoc.newDocumentBuilder();
				
				//Parse and find tags, starting with Person.
				Document document = buildDoc.parse(inputFile);
				NodeList nodes = document.getElementsByTagName("Person");
				
				
				//Match nodes and return to data to display.
				for (int i = 0; i < nodes.getLength(); i++)
					{
						Element element = (Element) nodes.item(i);
						
						//Display formatting for Person.
						System.out.println("Person -> ");
						
						//First Name Data.
						NodeList fname = element.getElementsByTagName("Fname");
						Element line = (Element) fname.item(0);
						System.out.println("FName -> " + GetElementData(line));

						//Last Name Data.
						NodeList lname = element.getElementsByTagName("Lname");
						line = (Element) lname.item(0);
						System.out.println("Lname -> " + GetElementData(line));
           
						//Last Age Data.
						NodeList age = element.getElementsByTagName("Age");
						line = (Element) age.item(0);
						System.out.println("Age -> " + GetElementData(line));
           
						//Display formatting for Address.
						System.out.println("Address -> ");
           
						//House Number Data.
						NodeList number = element.getElementsByTagName("Number");
						line = (Element) number.item(0);
						System.out.println("Number -> " + GetElementData(line));
           
						//Street Name Data.
						NodeList street = element.getElementsByTagName("Street");
						line = (Element) street.item(0);
						System.out.println("Street -> " + GetElementData(line));
           
						//City Name Data.
						NodeList city = element.getElementsByTagName("City");
						line = (Element) city.item(0);
						System.out.println("City -> " + GetElementData(line));
           
						//State Data.
						NodeList state = element.getElementsByTagName("State");
						line = (Element) state.item(0);
						System.out.println("State -> " + GetElementData(line));
           
						//Zip Code Data.
						NodeList zip = element.getElementsByTagName("Street");
						line = (Element) zip.item(0);
						System.out.println("Zip -> " + GetElementData(line));
					}
			}
			
			//Catch data errors and report.
			catch (Exception e)
				{
					e.printStackTrace();
				}
		}

	//Method to get and return the data within the XML tags.
	public String GetElementData(Element element)
		{
			Node nested = element.getFirstChild();
			if (nested instanceof CharacterData)
				{
					CharacterData data = (CharacterData) nested;
					return data.getData();
				}
					
					return "I don't know what this is?";
		}
}
