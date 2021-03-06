package com.portal.recruitcenter.service;

import com.javapms.basic.page.Pagination;
import com.portal.recruitcenter.entity.PersonalFavorite;

public abstract interface PersonalFavoriteService
{
  public abstract Pagination getPage(int paramInt1, int paramInt2);
  
  public abstract Pagination getPageByTag(Integer paramInteger, int paramInt1, int paramInt2);
  
  public abstract PersonalFavorite getFavoriteByPersonal(Integer paramInteger1, Integer paramInteger2);
  
  public abstract int deleteByCompanyId(Integer paramInteger);
  
  public abstract int deleteByJobId(Integer paramInteger);
  
  public abstract int deleteByPersonalId(Integer paramInteger);
  
  public abstract int deleteByMetierId(Integer paramInteger);
  
  public abstract PersonalFavorite findById(Integer paramInteger);
  
  public abstract PersonalFavorite save(PersonalFavorite paramPersonalFavorite);
  
  public abstract PersonalFavorite saveFavorite(Integer paramInteger1, Integer paramInteger2);
  
  public abstract PersonalFavorite update(PersonalFavorite paramPersonalFavorite);
  
  public abstract PersonalFavorite deleteById(Integer paramInteger);
  
  public abstract PersonalFavorite[] deleteByIds(Integer[] paramArrayOfInteger);
}


/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\
 * Qualified Name:     com.portal.recruitcenter.service.PersonalFavoriteService
 * JD-Core Version:    0.7.0.1
 */