package com.moneyhub.web.article;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="ARTICLE")
@Component
public class Article {
	@Id
	@GeneratedValue
	@Column(name="ARTSEQ", nullable=false)
	private Long artseq;
	@Column(name="IMAGE", nullable=false)
	private Long image;
	@Column(name="COMMENTS", nullable=false)
	private Long comments;
	@Column(name="MSG", nullable=false)
	private Long msg;
	@Column(name="RETING", nullable=false)
	private Long reting;
	@Column(name="BOARDTYPE", nullable=false)
	private Long boardType;
	@Column(name="TITLE", nullable=false)
	private Long title;
	@Column(name="CONTENT", nullable=false)
	private Long content;
	@Column(name="CEMAIL", nullable=false)
	private Long cemail;
	@Temporal(TemporalType.DATE)
	@Column(name="LEGDATE", nullable=false)
	private Date legdate;
}
