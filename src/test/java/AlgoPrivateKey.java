import static org.junit.Assert.fail;

import javax.xml.bind.DatatypeConverter;

import org.junit.Test;

import com.algoboss.core.entity.AdmContract;
import com.algoboss.core.util.AlgoUtil;
import com.algoboss.core.util.PrivateKey;
import com.google.gson.Gson;


public class AlgoPrivateKey {
	@Test
	public void test() {
		
		AdmContract contr = new AdmContract();
		PrivateKey pk = new PrivateKey();
		pk.setGatewayIp("123.123.1231");
		
		Gson gson = new Gson();
		try {
			System.out.println(AlgoUtil.decrypt(new String(AlgoUtil.encrypt(gson.toJson(pk)),"ISO-8859-1").getBytes("ISO-8859-1")));
			byte[] helloBytes = "HELLO WORLD".getBytes();
			String helloHex = DatatypeConverter.printHexBinary(helloBytes);
			System.out.printf("Hello hex: 0x%s\n", helloHex);
			
			//convert hex-encoded string back to original string
			byte[] decodedHex = DatatypeConverter.parseHexBinary(helloHex);
			String decodedString = new String(decodedHex, "UTF-8");
			System.out.printf("Hello decoded : %s\n", decodedString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //print hex string version of HELLO WORLD
		
		fail("Not yet implemented");
	}

}
