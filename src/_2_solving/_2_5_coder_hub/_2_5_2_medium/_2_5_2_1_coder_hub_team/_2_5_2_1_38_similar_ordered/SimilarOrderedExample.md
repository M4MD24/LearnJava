# <div dir="rtl">تشابه الترتيب الأبجدي</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قُم بكتابة دالة function تستقبل قيمتين نصية. تقوم الدالة بترتيب القيمتين النصية أبجدياً وإرجاع أطول حد تشابه بين القيمتين النصية . يتم أيضاً إزالة الأحرف المكررة في حد التشابه والإكتفاء بحرف واحد. في حال لم يُوجد تشابه بين القيمتين النصية، سيتم إرجاع القيمة No matches found.
</b>
</li>

<li>
<b>
مثال: word1= xcbacbwdwa و word2 = xcefwdfecxd تقوم الدالة بترتيب هذه الكلمتين أبجدياً وحذف الحروف المتكررة منها لتصبح word1=abcdwx و word2=cdefwx. ستقوم الدالة بإرجاع أطول أول تشابه بين الكلمتين هذه cd. نلاحظ تم تجاهل التشابه wx لأن التشابه ac ظهر قبله.
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
word1 = washing
word2 = waiting
```

#### <div dir="rtl">المُخرجات</div>

```text
ag
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
word1 = me
word2 = meet
```

#### <div dir="rtl">المُخرجات</div>

```text
em
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
word1 = Reem
word2 = Nouf
```

#### <div dir="rtl">المُخرجات</div>

```text
No matches found
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
word1 = abcdefggghi
word2 = abcdefghirr
```

#### <div dir="rtl">المُخرجات</div>

```text
abcdefghi
```