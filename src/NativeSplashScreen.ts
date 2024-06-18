import type {TurboModule} from 'react-native/Libraries/TurboModule/RCTExport';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  hide(): Promise<void>;
}

export default TurboModuleRegistry.get<Spec>(
  'RCTSplashScreen',
) as Spec | null;
