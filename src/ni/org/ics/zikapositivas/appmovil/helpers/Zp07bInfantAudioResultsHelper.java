package ni.org.ics.zikapositivas.appmovil.helpers;

import android.content.ContentValues;
import android.database.Cursor;

import ni.org.ics.zikapositivas.appmovil.domain.Zp07bInfantAudioResults;
import ni.org.ics.zikapositivas.appmovil.utils.MainDBConstants;
import ni.org.ics.zikapositivas.appmovil.utils.Zp07bDBConstants;


import java.util.Date;

/**
 * Created by ics on 22/6/2017.
 */
public class Zp07bInfantAudioResultsHelper {

    public static ContentValues crearZp07bInfantAudioResults(Zp07bInfantAudioResults zp07bInfantAudioResults){
        ContentValues cv = new ContentValues();
        cv.put(Zp07bDBConstants.recordId, zp07bInfantAudioResults.getRecordId());
        cv.put(Zp07bDBConstants.redcapEventName, zp07bInfantAudioResults.getRedcapEventName());
        if (zp07bInfantAudioResults.getInfantAudioDate()!=null) cv.put(Zp07bDBConstants.infantAudioDate, zp07bInfantAudioResults.getInfantAudioDate().getTime());

        cv.put(Zp07bDBConstants.infantAudioAir, zp07bInfantAudioResults.getInfantAudioAir());
        cv.put(Zp07bDBConstants.infantAr500rt, zp07bInfantAudioResults.getInfantAr500rt());
        cv.put(Zp07bDBConstants.infantAr500lft, zp07bInfantAudioResults.getInfantAr500lft());
        cv.put(Zp07bDBConstants.infantAr500vra, zp07bInfantAudioResults.getInfantAr500vra());
        cv.put(Zp07bDBConstants.infantAr1000rt, zp07bInfantAudioResults.getInfantAr1000rt());
        cv.put(Zp07bDBConstants.infantAr1000lft, zp07bInfantAudioResults.getInfantAr1000lft());
        cv.put(Zp07bDBConstants.infantAr1000vra, zp07bInfantAudioResults.getInfantAr1000vra());
        cv.put(Zp07bDBConstants.infantAr2000rt, zp07bInfantAudioResults.getInfantAr2000rt());
        cv.put(Zp07bDBConstants.infantAr2000lft, zp07bInfantAudioResults.getInfantAr2000lft());
        cv.put(Zp07bDBConstants.infantAr2000vra, zp07bInfantAudioResults.getInfantAr2000vra());
        cv.put(Zp07bDBConstants.infantAr4000rt, zp07bInfantAudioResults.getInfantAr4000rt());
        cv.put(Zp07bDBConstants.infantAr4000lft, zp07bInfantAudioResults.getInfantAr4000lft());
        cv.put(Zp07bDBConstants.infantAr4000vra, zp07bInfantAudioResults.getInfantAr2000vra());
        cv.put(Zp07bDBConstants.infantTransducer, zp07bInfantAudioResults.getInfantTransducer());
        cv.put(Zp07bDBConstants.infantUnmask1, zp07bInfantAudioResults.getInfantUnmask1());
        cv.put(Zp07bDBConstants.infantUnmask2, zp07bInfantAudioResults.getInfantUnmask2());
        cv.put(Zp07bDBConstants.infantUnmask3, zp07bInfantAudioResults.getInfantUnmask3());
        cv.put(Zp07bDBConstants.infantUnmask4, zp07bInfantAudioResults.getInfantUnmask4());
        cv.put(Zp07bDBConstants.infantImtanceRt, zp07bInfantAudioResults.getInfantImtanceRt());
        cv.put(Zp07bDBConstants.infantImrtReas, zp07bInfantAudioResults.getInfantImrtReas());
        cv.put(Zp07bDBConstants.infantImrtMl, zp07bInfantAudioResults.getInfantImrtMl());
        cv.put(Zp07bDBConstants.infantImrtDapa, zp07bInfantAudioResults.getInfantImrtDapa());
        cv.put(Zp07bDBConstants.infantImrtAdmi, zp07bInfantAudioResults.getInfantImrtAdmi());
        cv.put(Zp07bDBConstants.infantImrtTym, zp07bInfantAudioResults.getInfantImrtTym());
        cv.put(Zp07bDBConstants.infantImtanceLt, zp07bInfantAudioResults.getInfantImtanceLt());
        cv.put(Zp07bDBConstants.infantImltReas, zp07bInfantAudioResults.getInfantImltReas());
        cv.put(Zp07bDBConstants.infantImltMl, zp07bInfantAudioResults.getInfantImltMl());
        cv.put(Zp07bDBConstants.infantImltDapa, zp07bInfantAudioResults.getInfantImltDapa());
        cv.put(Zp07bDBConstants.infantImltAdmi, zp07bInfantAudioResults.getInfantImltAdmi());
        cv.put(Zp07bDBConstants.infantImltTym, zp07bInfantAudioResults.getInfantImltTym());
        cv.put(Zp07bDBConstants.infantImltProbe, zp07bInfantAudioResults.getInfantImltProbe());
        cv.put(Zp07bDBConstants.infantOe, zp07bInfantAudioResults.getInfantOe());
        cv.put(Zp07bDBConstants.infatnOetype, zp07bInfantAudioResults.getInfatnOetype());
        cv.put(Zp07bDBConstants.infantOert, zp07bInfantAudioResults.getInfantOert());
        cv.put(Zp07bDBConstants.infantOertRea, zp07bInfantAudioResults.getInfantOertRea());
        cv.put(Zp07bDBConstants.infantOert19, zp07bInfantAudioResults.getInfantOert19());
        cv.put(Zp07bDBConstants.infantOert29, zp07bInfantAudioResults.getInfantOert29());
        cv.put(Zp07bDBConstants.infantOert39, zp07bInfantAudioResults.getInfantOert39());
        cv.put(Zp07bDBConstants.infantOert49, zp07bInfantAudioResults.getInfantOert49());
        cv.put(Zp07bDBConstants.infantOelt, zp07bInfantAudioResults.getInfantOelt());
        cv.put(Zp07bDBConstants.infantOeltRea, zp07bInfantAudioResults.getInfantOeltRea());
        cv.put(Zp07bDBConstants.infantOelt19, zp07bInfantAudioResults.getInfantOelt19());
        cv.put(Zp07bDBConstants.infantOelt29, zp07bInfantAudioResults.getInfantOelt29());
        cv.put(Zp07bDBConstants.infantOelt39, zp07bInfantAudioResults.getInfantOelt39());
        cv.put(Zp07bDBConstants.infantOelt49, zp07bInfantAudioResults.getInfantOelt49());
        cv.put(Zp07bDBConstants.infantAbr, zp07bInfantAudioResults.getInfantAbr());
        cv.put(Zp07bDBConstants.infantAb500rt, zp07bInfantAudioResults.getInfantAb500rt());
        cv.put(Zp07bDBConstants.infantAb500lt, zp07bInfantAudioResults.getInfantAb500lt());
        cv.put(Zp07bDBConstants.infantAb1000rt, zp07bInfantAudioResults.getInfantAb1000rt());
        cv.put(Zp07bDBConstants.infantAb1000lt, zp07bInfantAudioResults.getInfantAb1000lt());
        cv.put(Zp07bDBConstants.infantAb2000rt, zp07bInfantAudioResults.getInfantAb2000rt());
        cv.put(Zp07bDBConstants.infantAb2000lt, zp07bInfantAudioResults.getInfantAb2000lt());
        cv.put(Zp07bDBConstants.infantEarphone, zp07bInfantAudioResults.getInfantEarphone());
        cv.put(Zp07bDBConstants.infantImpress, zp07bInfantAudioResults.getInfantImpress());
        cv.put(Zp07bDBConstants.infantTypeRt, zp07bInfantAudioResults.getInfantTypeRt());
        cv.put(Zp07bDBConstants.infantTypeLt, zp07bInfantAudioResults.getInfantTypeLt());
        cv.put(Zp07bDBConstants.infantTypeSound, zp07bInfantAudioResults.getInfantTypeSound());
        cv.put(Zp07bDBConstants.infantExtentRt, zp07bInfantAudioResults.getInfantExtentRt());
        cv.put(Zp07bDBConstants.infantExtentLt, zp07bInfantAudioResults.getInfantExtentLt());
        cv.put(Zp07bDBConstants.infantExtentSound, zp07bInfantAudioResults.getInfantExtentSound());
        cv.put(Zp07bDBConstants.infantConfigRt, zp07bInfantAudioResults.getInfantConfigRt());
        cv.put(Zp07bDBConstants.infantConfigLt, zp07bInfantAudioResults.getInfantConfigLt());
        cv.put(Zp07bDBConstants.infantConfigSound, zp07bInfantAudioResults.getInfantConfigSound());
        cv.put(Zp07bDBConstants.infantExamReliable, zp07bInfantAudioResults.getInfantExamReliable());
        cv.put(Zp07bDBConstants.infantRenotReliable, zp07bInfantAudioResults.getInfantRenotReliable());
        cv.put(Zp07bDBConstants.infantNreliableOther, zp07bInfantAudioResults.getInfantNreliableOther());
        cv.put(Zp07bDBConstants.infantAutocom, zp07bInfantAudioResults.getInfantAutocom());
        cv.put(Zp07bDBConstants.infantComAudo, zp07bInfantAudioResults.getInfantComAudo());
        cv.put(Zp07bDBConstants.infantAuLne, zp07bInfantAudioResults.getInfantAuLne());
        cv.put(Zp07bDBConstants.infantAuFne, zp07bInfantAudioResults.getInfantAuFne());
        cv.put(Zp07bDBConstants.infantAuPhone, zp07bInfantAudioResults.getInfantAuPhone());
        cv.put(Zp07bDBConstants.infantAuSignat, zp07bInfantAudioResults.getInfantAuSignat());
        if (zp07bInfantAudioResults.getInfantAuDate()!=null) cv.put(Zp07bDBConstants.infantAuDate, zp07bInfantAudioResults.getInfantAuDate().getTime());
        cv.put(Zp07bDBConstants.infantAuidCom, zp07bInfantAudioResults.getInfantAuidCom());
        if (zp07bInfantAudioResults.getInfantAudtCom()!=null) cv.put(Zp07bDBConstants.infantAudtCom, zp07bInfantAudioResults.getInfantAudtCom().getTime());
        cv.put(Zp07bDBConstants.infantAueyeIdRevi, zp07bInfantAudioResults.getInfantAueyeIdRevi());
        if (zp07bInfantAudioResults.getInfantAudtRevi()!=null) cv.put(Zp07bDBConstants.infantAudtRevi, zp07bInfantAudioResults.getInfantAudtRevi().getTime());
        cv.put(Zp07bDBConstants.infantAuidEntry, zp07bInfantAudioResults.getInfantAuidEntry());
        if (zp07bInfantAudioResults.getInfantAudtEnt()!=null) cv.put(Zp07bDBConstants.infantAudtEnt, zp07bInfantAudioResults.getInfantAudtEnt().getTime());

        if (zp07bInfantAudioResults.getRecordDate() != null) cv.put(MainDBConstants.recordDate, zp07bInfantAudioResults.getRecordDate().getTime());
        cv.put(MainDBConstants.recordUser, zp07bInfantAudioResults.getRecordUser());
        cv.put(MainDBConstants.pasive, String.valueOf(zp07bInfantAudioResults.getPasive()));
        cv.put(MainDBConstants.ID_INSTANCIA, zp07bInfantAudioResults.getIdInstancia());
        cv.put(MainDBConstants.FILE_PATH, zp07bInfantAudioResults.getInstancePath());
        cv.put(MainDBConstants.STATUS, zp07bInfantAudioResults.getEstado());
        cv.put(MainDBConstants.START, zp07bInfantAudioResults.getStart());
        cv.put(MainDBConstants.END, zp07bInfantAudioResults.getEnd());
        cv.put(MainDBConstants.DEVICE_ID, zp07bInfantAudioResults.getDeviceid());
        cv.put(MainDBConstants.SIM_SERIAL, zp07bInfantAudioResults.getSimserial());
        cv.put(MainDBConstants.PHONE_NUMBER, zp07bInfantAudioResults.getPhonenumber());
        if (zp07bInfantAudioResults.getToday() != null) cv.put(MainDBConstants.TODAY, zp07bInfantAudioResults.getToday().getTime());
        return cv;
    }

    public static Zp07bInfantAudioResults crearZp07bInfantAudioResults(Cursor cursorIA){
        Zp07bInfantAudioResults bInfantAudioResult = new Zp07bInfantAudioResults();
        bInfantAudioResult.setRecordId(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.recordId)));
        bInfantAudioResult.setRedcapEventName(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.redcapEventName)));
        if (cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudioDate))>0) bInfantAudioResult.setInfantAudioDate(new Date(cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudioDate))));
        bInfantAudioResult.setInfantAudioAir(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudioAir)));
        bInfantAudioResult.setInfantAr500rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr500rt)));
        bInfantAudioResult.setInfantAr500lft(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr500lft)));
        bInfantAudioResult.setInfantAr500vra(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr500vra)));
        bInfantAudioResult.setInfantAr1000rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr1000rt)));
        bInfantAudioResult.setInfantAr1000lft(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr1000lft)));
        bInfantAudioResult.setInfantAr1000vra(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr1000vra)));
        bInfantAudioResult.setInfantAr2000rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr2000rt)));
        bInfantAudioResult.setInfantAr2000lft(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr2000lft)));
        bInfantAudioResult.setInfantAr2000vra(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr2000vra)));
        bInfantAudioResult.setInfantAr4000rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr4000rt)));
        bInfantAudioResult.setInfantAr4000lft(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr4000lft)));
        bInfantAudioResult.setInfantAr4000vra(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAr4000vra)));
        bInfantAudioResult.setInfantTransducer(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantTransducer)));
        bInfantAudioResult.setInfantAudioBone(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudioBone)));
        bInfantAudioResult.setInfantUnmask1(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantUnmask1)));
        bInfantAudioResult.setInfantUnmask2(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantUnmask2)));
        bInfantAudioResult.setInfantUnmask3(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantUnmask3)));
        bInfantAudioResult.setInfantUnmask3(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantUnmask4)));
        bInfantAudioResult.setInfantImtanceRt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImtanceRt)));
        bInfantAudioResult.setInfantImrtReas(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImrtReas)));
        bInfantAudioResult.setInfantImrtMl(cursorIA.getFloat(cursorIA.getColumnIndex(Zp07bDBConstants.infantImrtMl)));
        bInfantAudioResult.setInfantImrtDapa(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImrtDapa)));
        bInfantAudioResult.setInfantImrtAdmi(cursorIA.getFloat(cursorIA.getColumnIndex(Zp07bDBConstants.infantImrtAdmi)));
        bInfantAudioResult.setInfantImrtTym(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImrtTym)));
        bInfantAudioResult.setInfantImtanceLt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImtanceLt)));
        bInfantAudioResult.setInfantImltReas(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImltReas)));
        bInfantAudioResult.setInfantImrtMl(cursorIA.getFloat(cursorIA.getColumnIndex(Zp07bDBConstants.infantImltMl)));
        bInfantAudioResult.setInfantImltDapa(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImltDapa)));
        bInfantAudioResult.setInfantImltAdmi(cursorIA.getFloat(cursorIA.getColumnIndex(Zp07bDBConstants.infantImltAdmi)));
        bInfantAudioResult.setInfantImltTym(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImltTym)));
        bInfantAudioResult.setInfantImltProbe(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImltProbe)));
        bInfantAudioResult.setInfantOe(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOe)));
        bInfantAudioResult.setInfatnOetype(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infatnOetype)));
        bInfantAudioResult.setInfantOert(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOert)));
        bInfantAudioResult.setInfantOertRea(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOertRea)));
        bInfantAudioResult.setInfantOert19(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOert19)));
        bInfantAudioResult.setInfantOert29(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOert29)));
        bInfantAudioResult.setInfantOert39(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOert39)));
        bInfantAudioResult.setInfantOert49(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOert49)));
        bInfantAudioResult.setInfantOelt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOelt)));
        bInfantAudioResult.setInfantOeltRea(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOeltRea)));
        bInfantAudioResult.setInfantOelt19(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOelt19)));
        bInfantAudioResult.setInfantOelt29(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOelt29)));
        bInfantAudioResult.setInfantOelt39(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOelt39)));
        bInfantAudioResult.setInfantOelt49(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantOelt49)));
        bInfantAudioResult.setInfantAbr(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAbr)));
        bInfantAudioResult.setInfantAb500rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAb500rt)));
        bInfantAudioResult.setInfantAb500lt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAb500lt)));
        bInfantAudioResult.setInfantAb1000rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAb1000rt)));
        bInfantAudioResult.setInfantAb1000lt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAb1000lt)));
        bInfantAudioResult.setInfantAb2000rt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAb2000rt)));
        bInfantAudioResult.setInfantAb2000lt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAb2000lt)));
        bInfantAudioResult.setInfantEarphone(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantEarphone)));
        bInfantAudioResult.setInfantImpress(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantImpress)));
        bInfantAudioResult.setInfantTypeRt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantTypeRt)));
        bInfantAudioResult.setInfantTypeLt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantTypeLt)));
        bInfantAudioResult.setInfantTypeSound(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantTypeSound)));
        bInfantAudioResult.setInfantExtentRt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantExtentRt)));
        bInfantAudioResult.setInfantExtentLt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantExtentLt)));
        bInfantAudioResult.setInfantExtentSound(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantExtentSound)));
        bInfantAudioResult.setInfantConfigRt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantConfigRt)));
        bInfantAudioResult.setInfantConfigLt(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantConfigLt)));
        bInfantAudioResult.setInfantConfigSound(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantConfigSound)));
        bInfantAudioResult.setInfantExamReliable(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantExamReliable)));
        bInfantAudioResult.setInfantRenotReliable(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantRenotReliable)));
        bInfantAudioResult.setInfantNreliableOther(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantNreliableOther)));
        bInfantAudioResult.setInfantAutocom(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAutocom)));
        bInfantAudioResult.setInfantComAudo(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantComAudo)));
        bInfantAudioResult.setInfantAuLne(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuLne)));
        bInfantAudioResult.setInfantAuFne(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuFne)));
        if (cursorIA.getInt(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuPhone))>0) bInfantAudioResult.setInfantAuPhone(cursorIA.getInt(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuPhone)));
        bInfantAudioResult.setInfantAuSignat(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuSignat)));
        if (cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuDate))>0) bInfantAudioResult.setInfantAuDate(new Date(cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuDate))));
        bInfantAudioResult.setInfantAuidCom(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuidCom)));
        if (cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudtCom))>0) bInfantAudioResult.setInfantAudtCom(new Date(cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudtCom))));
        bInfantAudioResult.setInfantAueyeIdRevi(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAueyeIdRevi)));
        if (cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudtRevi))>0) bInfantAudioResult.setInfantAudtRevi(new Date(cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudtRevi))));
        bInfantAudioResult.setInfantAuidEntry(cursorIA.getString(cursorIA.getColumnIndex(Zp07bDBConstants.infantAuidEntry)));
        if (cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudtEnt))>0) bInfantAudioResult.setInfantAudtEnt(new Date(cursorIA.getLong(cursorIA.getColumnIndex(Zp07bDBConstants.infantAudtEnt))));


        if(cursorIA.getLong(cursorIA.getColumnIndex(MainDBConstants.recordDate))>0) bInfantAudioResult.setRecordDate(new Date(cursorIA.getLong(cursorIA.getColumnIndex(MainDBConstants.recordDate))));
        bInfantAudioResult.setRecordUser(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.recordUser)));
        bInfantAudioResult.setPasive(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.pasive)).charAt(0));
        bInfantAudioResult.setIdInstancia(cursorIA.getInt(cursorIA.getColumnIndex(MainDBConstants.ID_INSTANCIA)));
        bInfantAudioResult.setInstancePath(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.FILE_PATH)));
        bInfantAudioResult.setEstado(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.STATUS)));
        bInfantAudioResult.setStart(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.START)));
        bInfantAudioResult.setEnd(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.END)));
        bInfantAudioResult.setSimserial(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.SIM_SERIAL)));
        bInfantAudioResult.setPhonenumber(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.PHONE_NUMBER)));
        bInfantAudioResult.setDeviceid(cursorIA.getString(cursorIA.getColumnIndex(MainDBConstants.DEVICE_ID)));
        if(cursorIA.getLong(cursorIA.getColumnIndex(MainDBConstants.TODAY))>0) bInfantAudioResult.setToday(new Date(cursorIA.getLong(cursorIA.getColumnIndex(MainDBConstants.TODAY))));

        return bInfantAudioResult;
    }
}