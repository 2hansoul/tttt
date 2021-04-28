package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dto.MilkDto;
import com.company.mapper.MilkMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MilkServicelmpl implements MilkService {
 @Setter(onMethod_ = @Autowired)
 private MilkMapper mapper;

@Override
public List<MilkDto> list() {
	// TODO Auto-generated method stub
	return mapper.list();
}

@Override
public boolean create(MilkDto dto) {
	// TODO Auto-generated method stub
	return mapper.create(dto)==1;
}

@Override
public MilkDto read(MilkDto dto) {
	// TODO Auto-generated method stub
	return mapper.read(dto);
}

@Override
public boolean update(MilkDto dto) {
	// TODO Auto-generated method stub
	return mapper.update(dto)==1;
}

@Override
public boolean delete(MilkDto dto) {
	// TODO Auto-generated method stub
	return mapper.delete(dto)==1;
}
 



}
