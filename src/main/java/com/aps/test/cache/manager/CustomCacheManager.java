/**
 * 
 */
package com.aps.test.cache.manager;

import java.io.Serializable;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

/**
 * @author asharma
 * 
 */
public class CustomCacheManager {

	/**
	 * 
	 */
	public CustomCacheManager() {
		super();
	}

	public void add2Cache(Serializable entity, Serializable id) {
		Ehcache cache = CacheFactory.getCache(entity.getClass().getName());
		cache.put(new Element(id, entity));
	}

}
