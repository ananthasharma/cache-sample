/**
 * 
 */
package com.aps.test.cache.test;

import com.aps.test.cache.manager.CustomCacheManager;
import com.aps.test.cache.model.SampleCachableBean;

/**
 * @author asharma
 * 
 */
public class MainClass {

	/**
	 * 
	 */
	public MainClass() {
		try {
			testAdd2Cache();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testAdd2Cache() throws Exception {
		CustomCacheManager ccm = new CustomCacheManager();
		for (int i = 0; i < 1000; i++) {
			SampleCachableBean entity = new SampleCachableBean(i + 18, "Cache-"
					+ i);
			ccm.add2Cache(entity, entity.getId());
		}
		System.out.println("Done.");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MainClass();
	}

}
