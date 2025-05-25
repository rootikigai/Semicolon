import bank
from unittest import TestCase

class BankTest(TestCase):
    def test_that_create_account_function_exists(self):
        account = bank.create_account("Kelvin Ikigai")
        self.assertEqual(account["name"], "Kelvin Ikigai")
        self.assertEqual(account[balance], 0.0)

