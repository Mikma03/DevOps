resource "local_file" "abc" {
  filename = var.filename
  sensitive_content = "abc"
}