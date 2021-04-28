package com.company.mapper;



import java.util.List;

import com.company.dto.MilkDto;

public interface MilkMapper {
   public List<MilkDto> list();
   public int       create(MilkDto dto);
   public MilkDto   read(MilkDto dto);
   public int       update(MilkDto dto);
   public int       delete(MilkDto dto);
	
}
