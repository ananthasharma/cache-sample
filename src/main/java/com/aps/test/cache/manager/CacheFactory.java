/**
 * 
 */
package com.aps.test.cache.manager;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;

/**
 * @author asharma
 * 
 */
public class CacheFactory {
	private static volatile CacheManager CACHE_MANAGER = new CacheManager();

	/**
	 * 
	 */
	private CacheFactory() {
		super();
	}

	public static Ehcache getCache(String name) {
		Ehcache cache = CACHE_MANAGER.addCacheIfAbsent(name);
		return cache;
	}

}
