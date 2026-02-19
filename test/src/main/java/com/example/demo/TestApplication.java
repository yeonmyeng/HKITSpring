package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

// 스프링 legacy vs 스프링 부트
// 기존 legacy의 경우는 세팅에 너무 많은시간이 할애되다보니
// 세팅의 간소화를 이룬것이 스프링부트

// 스프링 2일 특강
// 1. SMTP 구축을 기반으로한 이메일 서비스 구현.
// SMTP(Simple Mail Transfer Protocol) : 인터넷을 통해 이메일을 보낼때 사용하는 표준 프로토콜
//  -> 일종의 디지털 우체부
//  -> 기본적으로는 텍스트 기반.
// POP3/ IMAP
// SMTP는 오직 보내는것에만 특화되어있음. 받는것은 POP3/ IMAP을 통해 처리.
// POP3 : 서버의 메일을 내 기기로 가져올때.(가져온뒤에는 서버에서 메일은 삭제)
// IMAP : 서버와 내 기기를 동기화 할때(여러 기기에서 동일한 상태 확인 가능)


// 무료모델 유료모델 차이.

// Llama 3.2 -> gpt 4.5급













