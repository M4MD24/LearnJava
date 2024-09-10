# <div dir="rtl">حذف عنصر في المصفوفة</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة دالة function تستقبل قيمتين، الأولى مصفوفة array من نوع integer والثانية عدد صحيح موجب Non-negative integer. تقوم الـدالة بحذف العنصر الذي يحتوي على نفس رقم index الذي تم تمريره للدالة من الـمصفوفة وإرجاع مصفوفة جديدة ناتجة عن عملية الحذف.
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
arr = [3, 2, 4, 88]
index = 2
```

#### <div dir="rtl">المُخرجات</div>

```text
[3,2,88]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
arr = [3, -3, 4, 0]
index = 0
```

#### <div dir="rtl">المُخرجات</div>

```text
[-3,4,0]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
arr = [2, 4, 5]
index = 1
```

#### <div dir="rtl">المُخرجات</div>

```text
[2,5]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
arr = [1, 2, 3]
index = 0
```

#### <div dir="rtl">المُخرجات</div>

```text
[2,3]
```