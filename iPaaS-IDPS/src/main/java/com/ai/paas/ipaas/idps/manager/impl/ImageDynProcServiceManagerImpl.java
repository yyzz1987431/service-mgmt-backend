package com.ai.paas.ipaas.idps.manager.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ai.paas.ipaas.idps.manage.rest.interfaces.ImageDynProcServiceManager;
import com.ai.paas.ipaas.idps.service.constant.IdpsConstants;
import com.ai.paas.ipaas.idps.service.interfaces.IIdpsSv;
import com.ai.paas.ipaas.idps.service.util.IdpsParamUtil;
import com.alibaba.dubbo.config.annotation.Service;
/**
 *  Image dynamic Proccessing Service
 *
 */
@Service
public class ImageDynProcServiceManagerImpl implements ImageDynProcServiceManager {
	private static final Logger LOG = LogManager
			.getLogger(ImageDynProcServiceManagerImpl.class.getName());
	@Autowired
	private IIdpsSv iIdpsSv;
	@Override
	public String create(String createApply) {
		String res = null;
		try {
			res = iIdpsSv.open(createApply);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			return IdpsParamUtil.getReturn(createApply, IdpsConstants.FAIL_FLAG,e.getMessage());
		}
		return IdpsParamUtil.getReturn(createApply, res,null);
	}

	@Override
	public String cancel(String cancelApply) {
		String res = null;
		try {
			res = iIdpsSv.cancel(cancelApply);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			return IdpsParamUtil.getReturn(cancelApply, IdpsConstants.FAIL_FLAG,e.getMessage());
		}
		return IdpsParamUtil.getReturn(cancelApply, res,"cancel successfully!");
	}

	@Override
	public String modify(String modifyApply) {
		String res = null;
		try {
			res = iIdpsSv.modify(modifyApply);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			return IdpsParamUtil.getReturn(modifyApply, IdpsConstants.FAIL_FLAG,e.getMessage());
		}
		return IdpsParamUtil.getReturn(modifyApply, res,"modify successfully!");
	}

	@Override
	public String start(String startApply) {
		String res = null;
		try {
			res = iIdpsSv.start(startApply);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			return IdpsParamUtil.getReturn(startApply, IdpsConstants.FAIL_FLAG,e.getMessage());
		}
		return IdpsParamUtil.getReturn(startApply, res,"start successfully!");
	}

	@Override
	public String stop(String stopApply) {
		String res = null;
		try {
			res = iIdpsSv.stop(stopApply);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			return IdpsParamUtil.getReturn(stopApply, IdpsConstants.FAIL_FLAG,e.getMessage());
		}
		return IdpsParamUtil.getReturn(stopApply, res,"stop successfully!");
	}

	@Override
	public String restart(String restartApply) {
		String res = null;
		try {
			res = iIdpsSv.restart(restartApply);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			return IdpsParamUtil.getReturn(restartApply, IdpsConstants.FAIL_FLAG,e.getMessage());
		}
		return IdpsParamUtil.getReturn(restartApply, res,"restart successfully!");
	}

	@Override
	public String getFuncList() {
		return IdpsParamUtil.getFuncList();
	}
	
	
	
	

}
	