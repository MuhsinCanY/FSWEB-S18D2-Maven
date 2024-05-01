package com.workintech.sqldmlprocedures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlDmlProceduresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlDmlProceduresApplication.class, args);
	}

//	8) Öğrenci tablosunu kontrol etmek amaçlı tüm öğrencileri
//	görüntüleyen "ogrencilistesi" adında bir fonksiyon oluşturun.

//	create or replace function
//	public.ogrencilistesi()
//	returns setof ogrenci
//	language 'sql'
//	as $BODY$
//	select * from ogrenci
//	$BODY$


//	9)kitap tablosuna yeni kitap eklemek için "ekle"
//	adında bir prosedür oluşturun.
//
//
//	create or replace procedure
//	public.ekle(
//			in k_ad character varying,
//			in k_puan integer,
//			in k_yazarno bigint,
//			in k_turno bigint
//	)
//	language 'sql'
//	as $BODY$
//	insert into
//	public.kitap(ad,puan,yazarno,turno)
//	values(k_ad,k_puan,k_yazarno,k_turno)
//	$BODY$


//	10) Öğrenci noya göre öğrenci silebilmeyi sağlayan "sil"
//	adında bir prosedür oluşturun.
//
//	create or replace procedure
//	public.sil(in ogrid bigint)
//	language 'sql'
//	as $BODY$
//	delete from ogrenci
//	where ogrno = ogrid
//	$BODY$
}
