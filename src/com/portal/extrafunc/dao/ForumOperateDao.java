package com.portal.extrafunc.dao;

import com.javapms.basic.hibernate3.Updater;
import com.javapms.basic.page.Pagination;
import com.portal.extrafunc.entity.ForumOperate;

public abstract interface ForumOperateDao
{
  public abstract Pagination getPage(int paramInt1, int paramInt2);
  
  public abstract ForumOperate findById(Integer paramInteger);
  
  public abstract ForumOperate save(ForumOperate paramForumOperate);
  
  public abstract ForumOperate updateByUpdater(Updater<ForumOperate> paramUpdater);
  
  public abstract ForumOperate deleteById(Integer paramInteger);
}


/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\
 * Qualified Name:     com.portal.extrafunc.dao.ForumOperateDao
 * JD-Core Version:    0.7.0.1
 */