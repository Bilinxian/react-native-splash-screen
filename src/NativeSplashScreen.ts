import type {TurboModule} from 'react-native/Libraries/TurboModule/RCTExport';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  hide(): Promise<boolean>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('RCTSplashScreen') as Spec;
