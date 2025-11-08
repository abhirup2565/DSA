from collections import ChainMap

defaults = {'theme': 'dark', 'language': 'English'}
user_settings = {'language': 'French'}

settings = ChainMap(user_settings, defaults)

print(settings['language'])  # French (from user)
print(settings['theme'])     # dark (from defaults)
print(settings)
print(defaults)
print(user_settings)
