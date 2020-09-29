import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.google.gson.Gson;
import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.AccountDetail;
import com.rsc.payments.entity.model.Customer;

public class GetJSON {

	public static void main(String[] args) {
		
		List<Account> acts = new ArrayList<Account>();
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		cust.setAddress("Address1");
		cust.setCreatedBy("siva");
		cust.setCreatedDate(Calendar.getInstance());
		cust.setEmail("admin@rsc.com");
		cust.setFirstName("siva");
		cust.setLastName("lastname");
		cust.setPhonenumber("1234567890");
		cust.setTimeofOpening(Calendar.getInstance());
		cust.setLstAccounts(acts);
		
		Gson gson = new Gson();
		String j = gson.toJson(cust);
		System.out.println(j);
	
		Account act1 = new Account();
		act1.setAccountNumber("5454545");
		act1.setAcctType("SAV");
		act1.setBankCode("007700");
		act1.setBranchCode("123");
		act1.setCreatedBy(cust.getCreatedBy());
		act1.setCreatedDate(cust.getCreatedDate());
		//act1.setCust(cust);
		
		Account act2 = new Account();
		act2.setAccountNumber("5454545");
		act2.setAcctType("CURR");
		act2.setBankCode("008800");
		act2.setBranchCode("ABCD1");
		act2.setCreatedBy(cust.getCreatedBy());
		act2.setCreatedDate(cust.getCreatedDate());
		//act2.setCust(cust);
		
		acts.add(act1);
		acts.add(act2);
		
		
		AccountDetail actDtls = new AccountDetail();
		actDtls.setAccountOvrideInfo("None");
		actDtls.setAvailableBalance(1000);
		actDtls.setBranchcode("branch1");
		actDtls.setCreatedBy("user1");
		actDtls.setCreatedDate(Calendar.getInstance());
		actDtls.setLedgerBalance(2000);
		actDtls.setLocked(false);
		
		act1.setAcctDetails(actDtls);
		act2.setAcctDetails(actDtls);
		//cust.setLstAccounts(acts);
		
		//String jj = gson.toJson(cust);
		//System.out.println(jj);
		
		//System.out.println(gson.toJson(cust));
		
		/*{
			  "id": 0,
			  "firstName": "siva",
			  "lastName": "lastname",
			  "email": "admin@rsc.com",
			  "phonenumber": "1234567890",
			  "address": "Address1",
			  "timeofOpening": "2020-12-28",
			  "createdBy": "siva",
			  "createdDate": "2020-12-30"
			}
			*/
		
		
		/*
		 * {
  "id": 0,
  "accountNumber": "5454545",
  "acctType": "SAV",
  "ledgerBalance": 0,
  "bankCode": "007700",
  "branchCode": "123",
  "cust": {
    "id": 1
  },
  "acctDetails": {
    "id": 0,
    "branchcode": "branch1",
    "ledgerBalance": 2000,
    "availableBalance": 1000,
    "isLocked": false,
    "accountOvrideInfo": "None",
    "createdBy": "user1",
    "createdDate": "2020-12-31"
  },
  "createdBy": "siva",
  "createdDate": "2020-12-31"
}
		 */
	}

}
