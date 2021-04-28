package com.company.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PagingDto {
        private int listtotal;
        private int onepagelist;
        private int pagetotal;
        private int bottomlist;
        private int pstartno;
        private int current;
        private int start;
        private int end;
        public PagingDto() {}
        public PagingDto(int pstartno, int listcnt) {
        	this.listtotal =listcnt;
        	this.onepagelist =10;
        	this.pagetotal =(int) ((listtotal<=0)? 1: Math.ceil(listtotal/(float)onepagelist));
        	this.bottomlist =10;
        	this.pstartno = pstartno;
        	this.current =(int)(Math.ceil((pstartno+1)/(float)onepagelist));
            this.start =(int) (Math.floor((current-1)/bottomlist)*bottomlist+1);
            this.end =start+bottomlist-1;
            if(pagetotal < end) {this.end =pagetotal;}
        }
}
