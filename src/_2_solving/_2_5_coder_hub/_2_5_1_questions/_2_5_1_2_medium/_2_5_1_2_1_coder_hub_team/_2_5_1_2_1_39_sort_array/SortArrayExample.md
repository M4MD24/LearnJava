# <div dir="rtl">ترتيب المصفوفة حسب الشرط</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة دالة function تستقبل قيمتين، القيمة الأولى تعبر عن مصفوفة array من نوع integer ، والقيمة الثانية من نوع string تعبر هذة القيمة عن رمز لتعيين ترتيب المصفوفة array فإذا كان الرمز المدخل B تقوم الـدالة function بترتيب عناصر الـمصفوفة array من الأكبر إلى الأصغر وإذا كان الرمز S تقوم الـدالة function بالترتيب من الأصغر إلى الأكبر، ثم تقوم بإرجاع المصفوفة array بعد عملية الترتيب
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
my_array = [63, 12, 43, 56, 12]
typeParam = B
```

#### <div dir="rtl">المُخرجات</div>

```text
[63,56,43,12,12]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
my_array = [88, 12, 23, 59, 1, 24]
typeParam = S
```

#### <div dir="rtl">المُخرجات</div>

```text
[1,12,23,24,59,88]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
my_array = [100, 23, 200, 23, 1]
typeParam = B
```

#### <div dir="rtl">المُخرجات</div>

```text
[200,100,23,23,1]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
my_array = [99, 88, 774, 2]
typeParam = S
```

#### <div dir="rtl">المُخرجات</div>

```text
[2,88,99,774]
```