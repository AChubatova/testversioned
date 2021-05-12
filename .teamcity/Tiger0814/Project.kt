package Tiger0814

import Tiger0814.buildTypes.*
import Tiger0814.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0814")
    name = "Tiger0814"

    vcsRoot(Tiger0814_cVCSroot)

    buildType(Tiger0814_Hi3)
    buildType(Tiger0814_Hi2)
    buildType(Tiger0814_Hi1)
    buildType(Tiger0814_Hi0)
})
