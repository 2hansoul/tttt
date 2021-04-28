package com.company.service;

import java.util.List;

import com.company.dto.MilkDto;

public interface MilkService {
    public List<MilkDto> list();
	public boolean create(MilkDto dto);
	public MilkDto read(MilkDto dto);
	public boolean update(MilkDto dto);
	public boolean delete(MilkDto dto);

}
