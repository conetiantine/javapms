package com.portal.recruitcenter.dao;

import com.javapms.basic.hibernate3.Updater;
import com.javapms.basic.page.Pagination;
import com.portal.recruitcenter.entity.VipType;
import java.util.List;

public abstract interface VipTypeDao
{
  public abstract Pagination getPage(int paramInt1, int paramInt2);
  
  public abstract List<VipType> getAllVipType();
  
  public abstract VipType findById(Integer paramInteger);
  
  public abstract VipType save(VipType paramVipType);
  
  public abstract VipType updateByUpdater(Updater<VipType> paramUpdater);
  
  public abstract VipType deleteById(Integer paramInteger);
}


/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\
 * Qualified Name:     com.portal.recruitcenter.dao.VipTypeDao
 * JD-Core Version:    0.7.0.1
 */