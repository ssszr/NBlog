package top.naccl.service;

import top.naccl.entity.SiteSetting;

import java.util.List;
import java.util.Map;

public interface SiteSettingService {
	Map<String, List<SiteSetting>> getList();

	Map<String, Object> getSiteInfo();
}
