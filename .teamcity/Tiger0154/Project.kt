package Tiger0154

import Tiger0154.buildTypes.*
import Tiger0154.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0154")
    name = "Tiger0154"

    vcsRoot(Tiger0154_cVCSroot)

    buildType(Tiger0154_Hi2)
    buildType(Tiger0154_Hi1)
    buildType(Tiger0154_Hi3)
    buildType(Tiger0154_Hi0)
})
