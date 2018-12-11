package org.customer.service.intercomm;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.spi.LoggerFactory;
import org.customer.service.model.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.hystrix.FallbackFactory;

@FeignClient(name = "account-service", fallbackFactory = AccountClient.FeignClientFallbackFactory.class)
public interface AccountClient {
	@RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customerId}")
	List<Account> getAccounts(@PathVariable("customerId") Integer customerId);

	@Component
	static class FeignClientFallbackFactory implements
			FallbackFactory<AccountClient> {
		// private static final Logger LOGGER =
		// LoggerFactory.getLogger(FeignClientFallbackFactory.class);

		@Override
		public AccountClient create(Throwable cause) {
			// 先打印拦截到的异常
			// FeignClientFallbackFactory.LOGGER.info("fallback; reason was: {}, {}",
			// cause.getMessage(), cause);
			System.out
					.println("~!~!~!~!!~!~!~! FALLBACK Executed ~~~~~~~~~~~~~");
			return new AccountClient() {

				@Override
				public List<Account> getAccounts(Integer customerId) {
					// TODO Auto-generated method stub
					List<Account> lstAccounts = new ArrayList<Account>();
					Account act = new Account();
					act.setId(9);
					act.setNumber("1943");
					lstAccounts.add(act);
					return lstAccounts;
				}
			};
		}
	}
}
