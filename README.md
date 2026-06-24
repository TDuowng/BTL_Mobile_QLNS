# 📱 BTL_Mobile_QLNS

Ứng dụng **Quản lý Nhân sự trên nền tảng Android** được xây dựng bằng Java và SQLite nhằm hỗ trợ quản lý thông tin nhân viên, phòng ban, chức vụ, chấm công và tính lương.

---

# 1. Giới thiệu đề tài

## Bài toán

Trong các doanh nghiệp, việc quản lý nhân viên thường được thực hiện bằng sổ sách hoặc nhiều công cụ khác nhau, gây khó khăn trong việc lưu trữ, tra cứu và cập nhật thông tin. Điều này làm giảm hiệu quả quản lý và dễ xảy ra sai sót trong quá trình xử lý dữ liệu.

## Mục tiêu

Xây dựng ứng dụng Android hỗ trợ:

* Quản lý thông tin nhân viên
* Quản lý phòng ban
* Quản lý chức vụ
* Quản lý chấm công
* Quản lý lương
* Tìm kiếm và tra cứu dữ liệu nhanh chóng
* Lưu trữ dữ liệu cục bộ bằng SQLite

---

# 2. Dataset

## Nguồn dữ liệu

Dữ liệu được tạo thủ công và lưu trữ trong cơ sở dữ liệu SQLite của ứng dụng.

## Mô tả các bảng dữ liệu

### Bảng NhanVien

| Cột      | Kiểu dữ liệu | Mô tả         |
| -------- | ------------ | ------------- |
| MaNV     | INTEGER      | Mã nhân viên  |
| HoTen    | TEXT         | Họ tên        |
| GioiTinh | TEXT         | Giới tính     |
| NgaySinh | TEXT         | Ngày sinh     |
| SDT      | TEXT         | Số điện thoại |
| DiaChi   | TEXT         | Địa chỉ       |
| MaPB     | INTEGER      | Mã phòng ban  |
| MaCV     | INTEGER      | Mã chức vụ    |

### Bảng PhongBan

| Cột   | Kiểu dữ liệu | Mô tả         |
| ----- | ------------ | ------------- |
| MaPB  | INTEGER      | Mã phòng ban  |
| TenPB | TEXT         | Tên phòng ban |

### Bảng ChucVu

| Cột       | Kiểu dữ liệu | Mô tả       |
| --------- | ------------ | ----------- |
| MaCV      | INTEGER      | Mã chức vụ  |
| TenCV     | TEXT         | Tên chức vụ |
| HeSoLuong | REAL         | Hệ số lương |

### Bảng ChamCong

| Cột        | Kiểu dữ liệu | Mô tả        |
| ---------- | ------------ | ------------ |
| MaCC       | INTEGER      | Mã chấm công |
| MaNV       | INTEGER      | Mã nhân viên |
| SoNgayCong | INTEGER      | Số ngày công |

---

# 3. Pipeline hệ thống

```text
Nhập dữ liệu
      ↓
Kiểm tra dữ liệu
      ↓
Lưu vào SQLite
      ↓
Xử lý nghiệp vụ
(CRUD, tìm kiếm, tính lương)
      ↓
Hiển thị kết quả
```

### Tiền xử lý dữ liệu

* Kiểm tra dữ liệu đầu vào
* Kiểm tra trường bắt buộc
* Kiểm tra định dạng số điện thoại
* Loại bỏ dữ liệu không hợp lệ

### Xử lý nghiệp vụ

* Thêm dữ liệu
* Cập nhật dữ liệu
* Xóa dữ liệu
* Tìm kiếm dữ liệu
* Tính lương nhân viên

### Hiển thị kết quả

* Danh sách nhân viên
* Thông tin phòng ban
* Thông tin chức vụ
* Bảng chấm công
* Bảng lương

---

# 4. Công nghệ sử dụng

## Ngôn ngữ lập trình

* Java

## Cơ sở dữ liệu

* SQLite

## Framework và thư viện

* Android SDK
* RecyclerView
* CardView
* Intent
* AlertDialog

## Lý do lựa chọn

* Java là ngôn ngữ phổ biến trong phát triển Android.
* SQLite được tích hợp sẵn trên Android, phù hợp với các ứng dụng quản lý dữ liệu cục bộ.
* RecyclerView hỗ trợ hiển thị danh sách dữ liệu hiệu quả.

---

# 5. Kết quả đạt được

Ứng dụng đã hoàn thành các chức năng:

✅ Đăng nhập hệ thống

✅ Quản lý nhân viên

✅ Quản lý phòng ban

✅ Quản lý chức vụ

✅ Quản lý chấm công

✅ Tính lương

✅ Tìm kiếm dữ liệu

✅ Lưu trữ dữ liệu bằng SQLite

✅ Giao diện thân thiện và dễ sử dụng

---

# 6. Hướng dẫn chạy dự án

## Cài đặt môi trường

### Yêu cầu

* Android Studio Hedgehog hoặc mới hơn
* JDK 17
* Android SDK API 34+
* Gradle 8+

---

## Clone dự án

```bash
git clone https://github.com/TDuong/BTL_Mobile_QLNS.git
```

---

## Mở dự án

1. Mở Android Studio
2. Chọn Open
3. Chọn thư mục dự án
4. Chờ Gradle Sync hoàn tất

---

## Chạy ứng dụng

1. Kết nối điện thoại Android hoặc mở Android Emulator
2. Nhấn nút Run hoặc phím Shift + F10
3. Chờ ứng dụng cài đặt và khởi chạy

---

# 7. Cấu trúc thư mục dự án

```text
BTL_Mobile_QLNS
│
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   ├── activities
│   │   │   │   ├── adapters
│   │   │   │   ├── database
│   │   │   │   ├── models
│   │   │   │   └── utils
│   │   │   │
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   ├── drawable
│   │   │   │   ├── values
│   │   │   │   └── mipmap
│   │   │   │
│   │   │   └── AndroidManifest.xml
│
├── gradle
├── README.md
└── build.gradle
```

---

# 8. Tác giả

## Thành viên thực hiện

### Thành viên 1

* Họ và tên: Vũ Thị Thuỳ Dương
* Mã sinh viên: 12523019
* Lớp: 12523T.1

### Thành viên 2

* Họ và tên: Phạm Thị Nhung
* Mã sinh viên: 12523063
* Lớp: 12523T.1

---

## Giảng viên hướng dẫn

* ThS.Bùi Đức Thọ

---

# © BTL Mobile - Quản lý nhân sự

Dự án được thực hiện phục vụ mục đích học tập môn Lập trình Mobile.
