import { Text, View } from "react-native"

import { NativeModules } from "react-native"
const { CalendarModule } = NativeModules
console.log(CalendarModule)

CalendarModule.createCalendarEvent()

const App = () => {
  return(
    <View>
      <Text>Test Demo APP</Text>
    </View>
  )
}

export default App