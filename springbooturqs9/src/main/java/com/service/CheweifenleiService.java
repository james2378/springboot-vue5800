package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweifenleiView;


/**
 * 车位分类
 *
 * @author 
 * @email 
 * @date 2023-03-10 15:09:42
 */
public interface CheweifenleiService extends IService<CheweifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweifenleiVO> selectListVO(Wrapper<CheweifenleiEntity> wrapper);
   	
   	CheweifenleiVO selectVO(@Param("ew") Wrapper<CheweifenleiEntity> wrapper);
   	
   	List<CheweifenleiView> selectListView(Wrapper<CheweifenleiEntity> wrapper);
   	
   	CheweifenleiView selectView(@Param("ew") Wrapper<CheweifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweifenleiEntity> wrapper);
   	

}

