# <div dir="rtl">تجميع أجزاء النص</div>

## <div dir="rtl">السؤال</div>

<li dir="rtl">
<b>
قُم بكتابة دالة تستقبل ثلاث مُدخلات تحتوي قيم نصية A, B, C. تقوم هذه الدالة بإرجاع القيمة True فقط في حال كانت قيمة C عبارة عن أجزاء مُرتبة من القيمتين A و B. في حال كانت القيمة C تحتوي على جزء غير متواجد في القيمتين A و B، أو متواجد بترتيب لا يتوافق مع الترتيب الأصلي في A و B، تقوم الدالة بإرجاع القيمة False.
</b>
</li>

<li dir="rtl">
<b>
مثال:
A = abc, B = dca ,C = abdcca
</b>
</li>

<li dir="rtl">
<b>
عند التفصيل في القيمة C نلاحظ أن القيمة ab تم اجتزائها من A، ومن ثم القيمة dc اُجتزئت من B، ومن ثم c من A مره أخرى، وأخيراً a من B. لا يهم الاجتزاء من أي قيمة يبدأ، ولا كمية الاجتزاء، المهم انه بنفس الترتيب المُتبع في القيمة الأصلية، ولا يزيد أو ينقص عن مجموع المتواجد في القيمتين A و B.
</b>
</li>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
A = wysn
B = showus
C = shwysowuns
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
A = hsbxib
B = ywssg
C = hsywbxsisgb
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
A = zh2g
B = wts
C = shwt2gs
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
A = hsyhag
B = 2b12
C = hsy2bhag1
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```