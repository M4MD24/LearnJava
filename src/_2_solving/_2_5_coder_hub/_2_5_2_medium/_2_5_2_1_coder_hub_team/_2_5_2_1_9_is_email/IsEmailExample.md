# <div dir="rtl">صيغة البريد الإلكتروني</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li dir="rtl">
<b>
قم بكتابة دالة function تستقبل قيمة نصية من نوع string. تقوم الدالة بالتحقق ما إذا كانت القيمة النصية تحتوي على بريد إلكتروني صحيح أم لا، عن طريق إرجاع قيمة من نوع boolean.
</b>
</li>
</ul>

<ul dir="rtl">
<li dir="rtl">
<b>
شروط البريد الإلكتروني الصحيح
</b>
</li>
</ul>

<ul style="list-style-type: decimal;" dir="rtl">
<li>أن لا يبدأ رمز</li>
<li>أن يحتوي الجزء الأول على خانة على الأقل (ما قبل الرمز @)</li>
<li>أن يحتوي على الرمز @</li>
<li>أن يتبع رمز @ خانة على الأقل</li>
<li>أن يتبعه بعد ذلك بالرمز .</li>
<li>أن يتبع الرمز . بخانتين على الأقل</li>
<li>لا مانع من أن يحتوي الجزء الذي يسبق @ على الرموز التالية _.-</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
email = example@example.com
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
email = example@example.c
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
email = example@com
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
email = @example.com
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```